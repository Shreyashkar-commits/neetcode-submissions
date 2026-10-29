SELECT e.student_id, e.exam_id, e.score
FROM exam_results e
WHERE e.score = (
    SELECT MAX(e2.score)
    FROM exam_results e2
    WHERE e2.student_id = e.student_id
)
AND e.exam_id = (
    SELECT MIN(e3.exam_id)
    FROM exam_results e3
    WHERE e3.student_id = e.student_id
      AND e3.score = e.score
)
ORDER BY e.student_id ASC;