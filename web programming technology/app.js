const express = require("express");
const bodyparser = require("body-parser");
const cors = require("cors");
const routes = require("./routes/router");
const path = require('path');

const app = express();

app.use(cors());
app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());
app.use("/", routes);

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views')); // Corrected 'Views' to 'views'

app.get("/", (req, resp) => {
    resp.render('index', { data: [] });
});

app.listen(9000, () => {
    console.log("app started at server port 9000");
});

module.exports = app;
