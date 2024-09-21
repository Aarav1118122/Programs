import React from "react";

export default function Groups({ modernGroup, formalGroup }) {
    return (
        <>
            <div
                className={`groups ${modernGroup}`}
                style={{
                    gridRow: 1,
                    gridColumn: { modernGroup },
                }}
            >
                <div>{formalGroup}</div>
                <div>{modernGroup}</div>
            </div>
        </>
    );
}
