alter table auditoria alter column año_revisa 
drop not null

alter table auditoria alter column nombre 
drop not null

alter table auditoria alter column descripcion
drop not null

alter table auditoria alter column objetivos
drop not null

alter table observacion alter column numero_expediente
drop not null

alter table observacion alter column contratista
drop not null
