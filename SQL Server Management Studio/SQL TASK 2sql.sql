SELECT MAX(COMM)
FROM EMP;

SELECT
COUNT(DEPTNO)
FROM EMP;

SELECT JOB,COUNT(*)
FROM EMP
GROUP BY JOB;