import React, {useState} from "react";
import './HelloComponent.css'

export const HelloComponent = () => {
  const [value, setValue] = useState();

  const sendRequest = () => {
    fetch('/hello')
      .then(async response => {
        const data = await response.json();
        setValue(data.data)
      })
      .catch(error => {
        setValue(error.toString());
        console.error('There was an error!', error);
      });

  }
  return (
    <div className="HelloComponent">
      <button onClick={ () =>
        {sendRequest()}
      }> Hello!
      </button>
      <p>{value}</p>
    </div>
  )
}

