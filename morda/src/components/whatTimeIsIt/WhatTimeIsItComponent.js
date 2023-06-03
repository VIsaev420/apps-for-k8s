import React, {useState} from "react";
import './WhatTimeIsItComponent.css'

export const WhatTimeIsItComponent = () => {
  const [value, setValue] = useState();

  const sendRequest = () => {
    fetch('/what-time-is-it')
      .then(async response => {
        const data = await response.blob();

        setValue(URL.createObjectURL(data))
      })
      .catch(error => {
        setValue(error.toString());
        console.error('There was an error!', error);
      });

  }
  return (
    <div className="WhatTimeIsItComponent">
      <button onClick={() => {
        sendRequest()
      }
      }> What Time Is It?
      </button>
      <img src={value}/>
    </div>
  )
}