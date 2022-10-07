import { Request, Response } from 'express';
import { SQL_LISTAR } from './../repository/listarEstudiantes';
import DAO_Listar from "../daos/DAO_Listar";

class controladorListarEstudiantes extends DAO_Listar{

    public getEstudiantes(req:Request, res:Response):void{
        controladorListarEstudiantes.listarTodos(SQL_LISTAR.LISTAR_TODOS,[],res)
    }
}
const ctrl_listEstu = new controladorListarEstudiantes();
export default ctrl_listEstu;