CREATE TABLE verb (
    id INTEGER NOT NULL PRIMARY KEY,
    form TEXT NOT NULL 
);

CREATE TABLE pos (
    id INTEGER NOT NULL PRIMARY KEY,
    grace TEXT NOT NULL 
);

create table inflection (
    id INTEGER NOT NULL PRIMARY KEY,
    verb_id INTEGER NOT NULL,
    pos_id INTEGER NOT NULL,
    form TEXT NOT NULL,
    pron TEXT NOT NULL
);

