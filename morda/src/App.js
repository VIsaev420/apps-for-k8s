import './App.css';
import {HelloComponent} from "./components/hello/HelloComponent";
import {WhatTimeIsItComponent} from "./components/whatTimeIsIt/WhatTimeIsItComponent";
import './components/button/Button.css'

function App() {
  return (
    <div className="App">
      <div>
        <HelloComponent/>
        <WhatTimeIsItComponent/>
      </div>
    </div>
  );
}

export default App;
