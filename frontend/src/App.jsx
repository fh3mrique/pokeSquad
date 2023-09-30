import './App.css'
import { useState, useEffect } from 'react'
import Card from './components/Card'

const url = 'http://localhost:8080/trainers/list';

function App() {

  const [trainers, setTrainers] = useState([]);

  useEffect(() => {
    async function fetchData(){
      const resposta = await fetch(url);

      const dados = await resposta.json();

      setTrainers(dados);
    }

    fetchData()
  }, []);

  console.log(trainers)
  

  return (
    <>
      <h1>Api pokemons</h1>
      <Card trainers = {trainers}/>
    </>
  )
}

export default App
