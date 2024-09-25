import { useState } from "react";
import "./App.css";
import AudioUploader from "./AudioUploader";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <AudioUploader />
    </>
  );
}

export default App;
