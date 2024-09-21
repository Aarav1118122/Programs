import React from "react";
import Element from "./Element";
import data from "../PeriodicDetails";
import Groups from "./Groups";
export default function PeriodicTable({ colorMode }) {
    return (
        <div className={`periodic-table ${colorMode}`}>
            {data.groups.map((group) => (
                <Groups
                    modernGroup={group.modernGroup}
                    formalGroup={group.formalGroup}
                />
            ))}
            {data.elements.map((element) => (
                <Element key={element.number} elementNumber={element.number} />
            ))}
        </div>
    );
}
