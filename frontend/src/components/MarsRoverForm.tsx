import {ChangeEvent, FormEvent, useState} from "react";
import {fetchRoverFinalPosition} from "../services/RoverService.ts";

export function MarsRoverForm() {
    const [finalPosition, setFinalPosition] = useState<string>("0:0:N");
    const [command, setCommand] = useState<string>("");

    async function handleSubmit(event: FormEvent<HTMLFormElement>) {
        event.preventDefault();
        const newPosition = await fetchRoverFinalPosition(command);
        setFinalPosition(newPosition);
        setCommand("");
    }

    function handleChange(event: ChangeEvent<HTMLInputElement>) {
        setCommand(event.target.value);
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <label>Command: </label>
                <input type="text" id="roverCommand" placeholder="new command" onChange={handleChange} value={command}/>
                <button type={"submit"}>Execute</button>
            </form>
            <p>{finalPosition}</p>
        </>
    );
}