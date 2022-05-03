SELECT * FROM artists a 
--WHERE Name LIKE '%V%'
WHERE Name GLOB "*Sau*"
LIMIT 20;

INSERT INTO artists (Name)
VALUES ('Valdis Saulespurçns');

UPDATE artists 
SET Name = 'Rûta Saulespurçna'
WHERE ArtistId  = 277;

UPDATE artists 
SET Name = 'Valdis Saulespurçns'
WHERE Name GLOB '*Sau*';

SELECT * FROM artists a 
WHERE Name GLOB "*Sau*";

DELETE FROM artists 
WHERE ArtistId = 277;

SELECT * FROM albums a2
ORDER BY AlbumId DESC 
LIMIT 5;

INSERT INTO albums 
(Title, ArtistId)
VALUES ("My amazing Xmas album", 276)

SELECT * FROM tracks t 
ORDER BY TrackId DESC 
LIMIT 10;

INSERT INTO tracks 
(Name, AlbumId, MediaTypeId, 
GenreId, Composer, Milliseconds,
Bytes, UnitPrice)
VALUES ('Sitting ON a tree',348, 1,22,'Valdis S',181000,1359000, 2.99);

UPDATE tracks 
SET AlbumId = 348
WHERE TrackId = 3503;

SELECT * FROM genres g ;
INSERT INTO genres 
(genreID, Name)
VALUES (26, 'Kids dance music');

SELECT * FROM artists a ;
INSERT INTO artists 
(ArtistId, Name)
VALUES (279, 'Mickey Cooker');

SELECT * FROM albums a2
ORDER BY AlbumId DESC 
LIMIT 5;
INSERT INTO albums 
(Title, ArtistId)
VALUES ("Eating green", 279)

SELECT * FROM tracks t 
ORDER BY TrackId DESC 
LIMIT 10;

INSERT INTO tracks 
(Name, AlbumId, MediaTypeId, 
GenreId, Composer, Milliseconds,
Bytes, UnitPrice)
VALUES ('Chocolate cake',350, 1,26,'Minnie Cooker',181000,1459000, 5.99);

UPDATE tracks 
SET GenreId  =  25
WHERE TrackId = 3506;
DELETE FROM tracks  
WHERE TrackId  = 3506;

SELECT * FROM tracks t 
JOIN albums a 
ON t.AlbumId =a.AlbumId 
JOIN artists a2 
ON a.ArtistId = a2.ArtistId 
JOIN genres g 
ON t.GenreId = g.GenreId 
WHERE TrackId =3507;
