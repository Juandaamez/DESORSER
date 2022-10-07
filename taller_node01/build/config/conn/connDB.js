"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const pg_promise_1 = __importDefault(require("pg-promise"));
const opcionesConn_1 = require("../conn/opcionesConn");
const varDB_1 = __importDefault(require("../domains/varDB"));
const pgp = (0, pg_promise_1.default)(opcionesConn_1.opcionesPG);
const pool = pgp(varDB_1.default);
pool
    .connect()
    .then((conn) => {
    console.log("Conexión exitosa a la base de datos: ", varDB_1.default.database);
    conn.done();
})
    .catch((mierror) => {
    console.log(mierror);
});
exports.default = pool;
