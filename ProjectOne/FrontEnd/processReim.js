document.getElementById("submit-button").addEventListener("click",attemptSubmit);

async function attemptSubmit()
{
    const IDs = document.getElementById("ID").value;
    const ST = document.getElementById("status").value;

    console.log(IDs);
    console.log(ST);

    let reim =
    {
        "id" : IDs,
        "status" : ST,
    };
    console.log(reim);

    let response = await fetch("http://localhost:5000/approve",{
        method: "PUT",
        body: JSON.stringify(reim), //This will turn our user object into JSON we can send
        credentials: "include"
    });

    console.log(response.status);

}