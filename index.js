const db = require('./config/db');
const routes = require('./routes');
const express = require('express')
const app = express()

const port = 3000

require('./models/Pacientes');
require('./models/HistoriasClinicas');

async function test(){
  await db.sync();
  console.log("The database is connect");
}
test()

app.use('/', routes());
app.listen(port, () => console.log(`Example app listening on port ${port}!`))