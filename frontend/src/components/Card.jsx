import React from "react";
import "./card.css";

const Card = ({trainers}) => {
 if (trainers.length === 0) {
        return <p>Nenhum treinador encontrado</p>;
  }

  const treinador = trainers[0]

  return (
    <div className="cardContainer">
      <div className="card">
        <div className="header">
          <h1>{treinador.name}</h1>
        </div>
        <img
          src="https://archives.bulbagarden.net/media/upload/5/5c/Lets_Go_Pikachu_Eevee_Agatha.png"
          alt=""
        />

        <h2>Dados básicos</h2>
        <div className="wrapper">
          <div className="data-gender">
            <p className="left-side">Nome</p>
            <p className="right-side">{treinador.name}</p>
          </div>

          <div className="data-gender">
            <p className="left-side">Sexo</p>
            <p className="right-side">{treinador.genero}</p>
          </div>

          <div className="data-gender">
            <p className="left-side">Idade</p>
            <p className="right-side">{treinador.age} Anos</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Card;
