"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const connDB_1 = __importDefault(require("../config/conn/connDB"));
class DAO_Listar {
    static listarTodos(sql_Listar, parametros, res) {
        return __awaiter(this, void 0, void 0, function* () {
            connDB_1.default.result(sql_Listar, parametros).then((resultado) => {
                res.status(200).json(resultado.rows);
            }).catch((miError) => {
                console.log("Error de conexion", miError);
                res.status(400).json({ respuesta: "Error al listar los estudiantes" });
            });
        });
    }
}
exports.default = DAO_Listar;
