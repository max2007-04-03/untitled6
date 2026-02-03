INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY) VALUES
                                                       ('Maksym Slyvka', '2005-05-15', 'Junior', 1200),
                                                       ('Oleksii Ivanov', '1990-01-01', 'Senior', 6000),
                                                       ('Iryna Petrenko', '1995-03-20', 'Middle', 3500),
                                                       ('Dmytro Kozak', '2000-11-10', 'Trainee', 800),
                                                       ('Olena Koval', '1988-07-25', 'Senior', 7500),
                                                       ('Artem Bondar', '1998-12-12', 'Middle', 3200),
                                                       ('Svitlana Moroz', '2003-02-28', 'Trainee', 900),
                                                       ('Andriy Shevchenko', '1985-09-14', 'Senior', 8000),
                                                       ('Yulia Lysenko', '1992-06-05', 'Middle', 4000),
                                                       ('Roman Kucher', '2001-04-18', 'Junior', 1500);

INSERT INTO client (NAME) VALUES ('Tech Solution Inc'), ('Future Systems'), ('Global Trade'), ('Health Care Ltd'), ('Innovation Lab');

INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE) VALUES
                                                             (1, '2023-01-01', '2023-06-01'), (1, '2022-01-01', '2024-01-01'),
                                                             (2, '2023-05-01', '2023-12-01'), (3, '2020-01-01', '2025-01-01'),
                                                             (4, '2023-01-01', '2023-02-01'), (4, '2021-01-01', '2021-11-01'),
                                                             (5, '2022-06-01', '2023-06-01'), (2, '2023-01-01', '2024-05-01'),
                                                             (3, '2023-08-01', '2023-10-01'), (5, '2024-01-01', '2025-01-01');

INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES
                                                       (1, 1), (1, 2), (2, 2), (2, 5), (2, 8), (3, 3), (3, 6), (3, 9), (4, 4), (4, 7),
                                                       (4, 10), (4, 1), (4, 2), (5, 1), (5, 5), (6, 3), (6, 8), (7, 9), (8, 2), (8, 10),
                                                       (9, 6), (9, 7), (10, 5), (10, 8);