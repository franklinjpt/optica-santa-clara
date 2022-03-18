const { Sequelize, DataTypes, Model } = require('sequelize');
const sequelize = require('../config/db');
const HistoriasClinicas = require('./HistoriasClinicas');

class Paciente extends Model {

  getFullname() {
    return [this.nombre, this.apellido].join(' ');
  }

}

Paciente.init({
  paciente_id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true   
  },
  cedula: DataTypes.STRING(11),
  nombre: DataTypes.STRING(60),
  apellido: DataTypes.STRING(60),
  celular: DataTypes.STRING(10),
  edad: DataTypes.INTEGER,
  clase_paciente: {
    type: DataTypes.ENUM,
    values: ['particular','empresarial']
  }
}, {
  sequelize, 
  modelName: 'pacientes',
  timestamps: false
});

Paciente.hasMany(HistoriasClinicas,{
  foreignKey: 'pacienteId'
})
// HistoriasClinicas.belongsTo(Paciente);

module.exports = Paciente;
