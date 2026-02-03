SELECT NAME, COUNT(project.ID) AS PROJECT_COUNT
FROM client
JOIN project ON client.ID = project.CLIENT_ID
GROUP BY client.NAME
HAVING COUNT(project.ID) = (
    SELECT COUNT(ID)
    FROM project
    GROUP BY CLIENT_ID
    ORDER BY COUNT(ID) DESC
    LIMIT 1
    );