"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const controladorListarAeropuertos_1 = __importDefault(require("../controllers/controladorListarAeropuertos"));
class Rutas {
    constructor() {
        this.rutasAPI = (0, express_1.Router)();
        this.config();
    }
    config() {
        this.rutasAero();
    }
    rutasAero() {
        this.rutasAPI.get("/aeropuertos", controladorListarAeropuertos_1.getAeropuertos);
        this.rutasAPI.get("/aeropuertosid/:id", controladorListarAeropuertos_1.getAeropuertos)
    }
}
const rutas = new Rutas();
exports.default = rutas.rutasAPI;
