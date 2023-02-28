select animal_type, (
    case when name is null then "No name"
        when name is not null then name
    end
) as name, sex_upon_intake
from animal_ins
order by animal_id;