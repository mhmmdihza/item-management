CREATE TABLE item_master(
   ITEMID CHAR(50) PRIMARY KEY  NOT NULL,
   SATUAN CHAR(50) not null,
   DESKRIPSI text
);
create table lookup_item(

   REQUESTID CHAR(50)  NOT NULL,
   sourceoffice CHAR(50) not null,
   itemid CHAR(50) not null ,
   qty INT not null,
   SNID text
);

CREATE SEQUENCE lookup_item_seq;
ALTER TABLE lookup_item
ADD COLUMN id int;
ALTER TABLE lookup_item ADD PRIMARY KEY (id);
ALTER TABLE lookup_item ALTER id SET DEFAULT NEXTVAL('lookup_item_seq');

create table office(
	
	id CHAR(50) PRIMARY KEY  NOT NULL,
	alamat text not null,
	notelp char(50)
);

INSERT INTO 
    office (id, alamat,notelp)
VALUES
    ('TJDUREN','jl tjduren','gang salak'),
    ('GROGOL','jl grogol','mawardi'),
    ('SLIPI','jl slipi','baruna');

INSERT INTO 
    item_master (ITEMID, SATUAN,DESKRIPSI)
VALUES
    ('1','Ban Dalam Michele','Ban dalam merk michele'),
    ('2','Tang Potong Tekiro','Tang Potong merk Tekiro'),
    ('3','Sepatu','Boots');