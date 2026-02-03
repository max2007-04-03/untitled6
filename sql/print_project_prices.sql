SELECT 'Project ' || p.ID AS NAME,
       SUM(w.SALARY) * (EXTRACT(YEAR FROM age(p.FINISH_DATE, p.START_DATE)) * 12 + EXTRACT(MONTH FROM age(p.FINISH_DATE, p.START_DATE))) AS PRICE
FROM project p
         JOIN project_worker pw ON p.ID = pw.PROJECT_ID
         JOIN worker w ON pw.WORKER_ID = w.ID
GROUP BY p.ID
ORDER BY PRICE DESC;