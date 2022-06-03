document.getElementById("submit-button").addEventListener("submit",attemptSubmit);

async function attemptSubmit()
{
    const IDs = getElementById("ID").value;
    const ST = getElementById("status").value;

    console.log(IDs);
    console.log(ST);


    let response = await fetch("http://localhost:5000/approve",{
        method: "POST",
        body: JSON.stringify(reim), //This will turn our user object into JSON we can send
        credentials: "include"
    });

    console.log(response);

}