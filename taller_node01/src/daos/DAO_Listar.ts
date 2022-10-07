import { SQL_LISTAR } from "./../repository/listarEstudiantes";
import { Response } from "express"
import pool from "../config/conn/connDB";

class DAO_Listar {
  protected static async listarTodos(
    sql_Listar: string,
    parametros: any,
    res: Response
  ):Promise<any>{
    pool.result(sql_Listar, parametros).then(
        (resultado)=>{
            res.status(200).json(resultado.rows);
        }
    ).catch((miError)=>{
        console.log("Error de conexion",miError);
        res.status(400).json({respuesta:"Error al listar los estudiantes"});
    })
  }
  
}
export default DAO_Listar;
