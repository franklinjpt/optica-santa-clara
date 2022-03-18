const { Sequelize, DataTypes, Model } = require('sequelize');
const sequelize = require('../config/db');

class HistoriaClinica extends Model {}

HistoriaClinica.init({
  historiaclinica_id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true
  },
  fecharegistro: DataTypes.DATEONLY,
  diagnostico: DataTypes.TEXT,
  motivodeconsulta: DataTypes.TEXT,
},{
  sequelize,
  timestamps: false,
  modelName: "historiasclinicas"
})

module.exports = HistoriaClinica;
