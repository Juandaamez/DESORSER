"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.opcionesPG = void 0;
const funcionConn_1 = require("../conn/funcionConn");
exports.opcionesPG = {
    receive(data, result, e) {
        (0, funcionConn_1.camelizeColumns)(data);
    },
};
