const express = require('express');
const {getHealthCheck} = require('./src/healthCheck');
const {transformadorRomanos} = require('./src/transformador');
const cors = require('cors');
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.disable('x-powered-by');
app.use(cors())

app.get('/healthCheck', function (req, res) {
  res.send(getHealthCheck());
});

app.get('/transformador/romanos/:numero', function (req, res) {
    const {numero} = req.params;
    return res.send({number: transformadorRomanos(numero)});
});

app.get('/transformador/arabigos/:numero', function (req, res) {

});

app.listen(3012);