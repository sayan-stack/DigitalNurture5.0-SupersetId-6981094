import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 98 },
        { name: "Rohit Sharma", score: 45 },
        { name: "Shubman Gill", score: 88 },
        { name: "KL Rahul", score: 65 },
        { name: "Hardik Pandya", score: 74 },
        { name: "Ravindra Jadeja", score: 69 },
        { name: "R Ashwin", score: 80 },
        { name: "Mohammed Shami", score: 55 },
        { name: "Jasprit Bumrah", score: 91 },
        { name: "Kuldeep Yadav", score: 63 },
        { name: "Ishan Kishan", score: 77 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>

            <h2>List of Players</h2>

            {
                players.map((player, index) => (
                    <p key={index}>
                        {player.name} - {player.score}
                    </p>
                ))
            }

            <h2>Players with Score below 70</h2>

            {
                lowScorePlayers.map((player, index) => (
                    <p key={index}>
                        {player.name} - {player.score}
                    </p>
                ))
            }

        </div>
    );

}

export default ListofPlayers;