import pgPromise from "pg-promise";

import { opcionesPG } from "../conn/opcionesConn";
import variablesConexion from "../domains/varDB";

const pgp = pgPromise(opcionesPG);

const pool = pgp(variablesConexion);

pool
  .connect()
  .then((conn) => {
    console.log(
      "Conexión exitosa a la base de datos: ",
      variablesConexion.database
    );
    conn.done();
  })
  .catch((mierror) => {
    console.log(mierror);
  });

export default pool;