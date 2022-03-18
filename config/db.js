const { Sequelize } = require("sequelize");
require('dotenv').config();

const {DB_NAME,DB_USER,DB_PASS,DB_HOST,DB_PORT} = process.env;

const sequelize = new Sequelize(DB_NAME,DB_USER,DB_PASS,{
  host: DB_HOST,
  dialect: 'postgres',
  port: DB_PORT,
  logging: false, 
});

module.exports = sequelize;