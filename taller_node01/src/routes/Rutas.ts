import { Router } from "express";
import ctrl_listEstu from "../controllers/controladorListarEstudiantes";

class Rutas {
    public rutasAPI:Router;

    constructor(){
        this.rutasAPI=Router();
        this.config();
    }

    public config(){
        this.rutasEstu();
    }
    public rutasEstu(){
        this.rutasAPI.get("/estudiantes",ctrl_listEstu.getEstudiantes)
    }
}
const rutas = new Rutas();
export default rutas.rutasAPI;