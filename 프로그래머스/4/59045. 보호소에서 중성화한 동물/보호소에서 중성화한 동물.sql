-- 코드를 입력하세요
SELECT i.animal_id, i.animal_type, i.name
FROM animal_ins AS i
JOIN animal_outs AS o ON i.animal_id = o.animal_id
WHERE i.SEX_UPON_INTAKE LIKE 'Intact%'
  AND (o.SEX_UPON_OUTCOME LIKE 'Neutered%' OR o.SEX_UPON_OUTCOME LIKE 'Spayed%')
ORDER BY i.animal_id;
