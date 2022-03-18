const Pacientes = require('../models/Pacientes');

exports.getUser = async (req, res) => {
  const {id} = req.params;
  const result = await Pacientes.findByPk(id);
  res.json(result);
}