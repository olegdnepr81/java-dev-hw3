package org.example;

public class PopulateDb {
    static final Worker[] workers = new Worker[]{
            (new Worker("Katharine", "1991-07-11", "Trainee", 300d)),
            (new Worker("Humphrey", "1989-05-15", "Trainee", 300d)),
            (new Worker("Cary", "1981-05-10", "Junior", 500)),
            (new Worker("Audrey", "1993-11-18", "Junior", 500)),
            (new Worker("James", "1985-02-14", "Junior", 700)),
            (new Worker("Marlon", "1995-09-03", "Junior", 800)),
            (new Worker("Ingrid", "1987-08-24", "Middle", 2300)),
            (new Worker("Fred", "1990-04-19", "Middle", 2100)),
            (new Worker("Greta", "1961-05-10", "Senior", 5500)),
            (new Worker("Elizabeth", "1961-05-10", "Senior", 6300))};

    static final Client[] clients = new Client[]{
            new Client("Clark"),
            new Client("Judy"),
            new Client("Spencer"),
            new Client("Marlene"),
            new Client("Barbara")};

    static final Project[] projects = new Project[]{
            new Project(1, "2023-01-04", "2023-01-04"),
            new Project(5, "2022-03-08", "2023-08-08"),
            new Project(5, "2022-01-12", "2024-09-12"),
            new Project(1, "2021-01-19", "2025-07-19"),
            new Project(3, "2019-11-07", "2026-08-07"),
            new Project(4, "2017-07-03", "2023-08-03"),
            new Project(4, "2023-01-09", "2030-07-09"),
            new Project(5, "2016-08-06", "2024-09-06"),
            new Project(2, "2015-06-01", "2023-09-01"),
            new Project(2, "2019-09-28", "2025-04-28")
    };

    static final ProjectWorker[] projectWorkers = new ProjectWorker[]{
            new ProjectWorker(1, 1),
            new ProjectWorker(1, 3),
            new ProjectWorker(1, 7),
            new ProjectWorker(2, 2),
            new ProjectWorker(2, 3),
            new ProjectWorker(3, 4),
            new ProjectWorker(3, 5),
            new ProjectWorker(3, 6),
            new ProjectWorker(4, 3),
            new ProjectWorker(4, 4),
            new ProjectWorker(5, 7),
            new ProjectWorker(6, 7),
            new ProjectWorker(6, 8),
            new ProjectWorker(6, 3),
            new ProjectWorker(7, 2),
            new ProjectWorker(7, 3),
            new ProjectWorker(7, 4),
            new ProjectWorker(7, 5),
            new ProjectWorker(7, 7),
            new ProjectWorker(8, 8),
            new ProjectWorker(8, 9),
            new ProjectWorker(9, 7),
            new ProjectWorker(9, 8),
            new ProjectWorker(9, 10),
            new ProjectWorker(10, 6),
            new ProjectWorker(10, 7),
            new ProjectWorker(10, 10)
    };
}

