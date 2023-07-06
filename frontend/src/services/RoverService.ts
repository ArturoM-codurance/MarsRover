export const fetchRoverFinalPosition = async (command: string): Promise<string> => {
    const data = await fetch(`${import.meta.env.VITE_LAMBDA_URL}/execute`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({"command": command})
    });
    const json = await data.text();
    return json;
};