-- 코드를 작성해주세요
select count(id) from ECOLI_DATA where GENOTYPE & 2 = 0  and GENOTYPE & 5 !=0;