import cors from "cors";
import morgan from "morgan";
import express from "express";
import rutasApi from "../../routes/Rutas";

class Servidor {
  public app: express.Application;

  constructor() {
    this.app = express();
    this.iniciarConfiguracion();
    this.activarRutas();
  }

  public iniciarConfiguracion(): void {
    this.app.set("PORT", 8082);
    this.app.use(cors());
    this.app.use(morgan("dev"));
    this.app.use(express.json({ limit: "100mb" }));
    this.app.use(express.urlencoded({ extended: true }));
  }

  public activarRutas(): void {
    this.app.use("/api/universidad", rutasApi);
  }

  public iniciar(): void {
    const port = this.app.get("PORT");
    this.app.listen(port, () => {
      console.log("Funcionando en : ", port);
    });
  }
}
export default Servidor;