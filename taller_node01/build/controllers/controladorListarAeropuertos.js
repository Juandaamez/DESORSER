import { Request, Response } from "express";
import { SQL_LISTAR } from "./../repository/listarAeropuertos"
import DAO_Listar from "../daos/DAO_Listar";


class controladorListarAeropuertos extends DAO_Listar {
    public getAeropuertos(req : Request, res : Response) : void {
        controladorListarAeropuertos.listarTodos(listarAeropuertosn.SQL_LISTAR.LISTAR_TODOS, [], res);
    }

    public getAeropuertosId(req : Request, res : Response) : void{
        let id : String = req.params.id;
        controladorListarAeropuertos.listarTodos(SQL_LISTAR.LISTAR_ID, id, res);
    }
    public getAeropuertosTotal (req : Request, res : Response) : void{
        controladorLIstarEstu.listarTodos(SQL_LISTAR)
    }
}
const ctrl_listAero = new controladorListarAeropuertos();
exports.default = ctrl_listAero;


