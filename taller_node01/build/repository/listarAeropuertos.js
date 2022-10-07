"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SQL_LISTAR = void 0;
exports.SQL_LISTAR = {
    LISTAR_TODOS: 
      "SELECT * FROM aeropuertos aero ORDER BY aero.id_aeropuerto ASC",
    LISTAR_ID:
      "SELECT * FROM estudiantes estu WHERE estu.id_estudiante = $1",
    LISTAR_TOTAL: 
      "SELECT COUNT(estu.id_estudiante) FROM estudiantes estu",
    
};
