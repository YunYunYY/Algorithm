-- 코드를 작성해주세요
select count(id) from ECOLI_DATA where GENOTYPE div 2%2!=1 and (GENOTYPE div 4%2=1 or GENOTYPE %2 =1)