const { Router } = require('express');
const pacientesCtrl = require('../controllers/pacientes.controller');

const router = Router();

module.exports = function() {
  router.get('/pacientes/:id', pacientesCtrl.getUser);

  return router;
}
