# About

This is a basic Java program that connects to Oracle DB to insert randomly generated Book entries.

# Requirements

- Working, set up and configured Oracle database (will be used to connect to using this program)
- Java (23 is used in project)
- Oracle JDBC .jar file (can be obtained via [Oracle's Website](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html))

# How to Run

- Add Book table to your Oracle db (sample SQL provided in the next section)
- Clone this repo locally
- Open with your favourite IDE
- Add Oracle JDBC
- Tweak application.properties to reflect your Oracle DB credentials.
- Run `Main.java`

Once you run the program, the records should be adding to your Oracle database.

# Sample Oracle Book Table

Below is a sample sql for adding Book table:

```
CREATE TABLE C##USERNAME.BOOK (
    ID NUMBER,
    NAME VARCHAR2(128),
    ISBN VARCHAR2(32),
    CREATE_DATE DATE DEFAULT SYSDATE
);

-- Create a sequence for the ID
CREATE SEQUENCE C##USERNAME.SEQ_BOOK_ID
    START WITH 1
    INCREMENT BY 1
    CACHE 100;

-- Add primary key
ALTER TABLE C##USERNAME.BOOK ADD CONSTRAINT PK_BOOK PRIMARY KEY (ID);
```

# Expected output

If you have done everything correctly, your console output should look something like this:

```
Inserted book: Book GIYBBV9mHN with ISBN: 395-6-798-45702-8
Inserted book: Book rcJPZy1HiQ with ISBN: 496-4-593-32989-7
Inserted book: Book ok5Ih69YXj with ISBN: 292-8-612-50846-7
Inserted book: Book sduO818GPk with ISBN: 455-5-740-45094-3
Inserted book: Book PqxYnl1r7r with ISBN: 917-3-953-80945-3
Inserted book: Book yRD85PqHaf with ISBN: 036-1-299-79418-0
Inserted book: Book U9kDQ8rPh7 with ISBN: 107-3-511-24543-7
Inserted book: Book J656wWhSWK with ISBN: 165-3-259-41631-6
Inserted book: Book rhJahivTZb with ISBN: 218-2-574-55216-3
Inserted book: Book K7PbwKflAl with ISBN: 585-0-523-13105-4
Inserted book: Book 4t5MgBO2JH with ISBN: 151-7-344-63911-2
Inserted book: Book EGc0bHeRs4 with ISBN: 857-0-000-07759-3
Inserted book: Book ttITBwcl0T with ISBN: 881-6-136-71312-8
Inserted book: Book 8mOvKN4rTi with ISBN: 075-0-364-16513-4
Inserted book: Book l1OeMXZ4uv with ISBN: 176-3-257-16446-5
Inserted book: Book jeHjDywguI with ISBN: 881-9-531-93447-8
Inserted book: Book TTmeKCa0AS with ISBN: 868-6-221-97703-5
Inserted book: Book A7D3iDPQ9e with ISBN: 562-6-457-02535-2
Inserted book: Book FGiOIruJvT with ISBN: 796-0-953-69810-5
Inserted book: Book q87P8PwUaT with ISBN: 134-5-843-95907-0
Inserted book: Book bac7ZjUYe8 with ISBN: 715-8-875-06764-8
Inserted book: Book KkvGAdSWU6 with ISBN: 433-9-390-00705-2
Inserted book: Book YcOcMmBEMA with ISBN: 536-8-153-34426-0
Inserted book: Book VzymV6GJLS with ISBN: 916-4-789-86651-8
Inserted book: Book EtcYdpqA3l with ISBN: 600-8-971-38087-8
Inserted book: Book 4ie882WN6v with ISBN: 562-3-480-42031-9
Inserted book: Book ZnbkebWNDX with ISBN: 969-7-192-32050-2
Inserted book: Book n0kn1qDVBU with ISBN: 103-4-204-76564-5
Inserted book: Book 1wNrIoC5sX with ISBN: 772-1-684-97614-7
Inserted book: Book P75ZNmhTry with ISBN: 505-0-957-79656-1
Inserted book: Book 6n1PwcdC2A with ISBN: 463-7-244-42563-8
Inserted book: Book pWaEtJ5u2E with ISBN: 969-1-843-40037-6
Inserted book: Book 85Ghdn3SLq with ISBN: 643-8-674-72075-3
Inserted book: Book vWWpzLRbNN with ISBN: 521-9-470-10470-7
Inserted book: Book qw54U7v1Ea with ISBN: 770-3-146-43984-2
Inserted book: Book dNU99JBtZA with ISBN: 991-2-679-63134-7
Inserted book: Book SJWsXvUp4D with ISBN: 933-2-724-12143-0
Inserted book: Book YVavpOaUMA with ISBN: 327-0-119-25710-4
Inserted book: Book alE8qyKDVW with ISBN: 163-3-363-00136-0
Inserted book: Book ee6W8fvahX with ISBN: 843-1-009-93233-2
Inserted book: Book AdruB7xyFG with ISBN: 092-4-616-60583-0
Inserted book: Book F4FmaQ1jDs with ISBN: 977-7-755-91640-2
Inserted book: Book yDDvTgSXaa with ISBN: 413-6-311-81972-2
Inserted book: Book jqvA1Ssvhi with ISBN: 750-4-042-00628-7
Inserted book: Book jjkAnd9yP7 with ISBN: 659-9-715-12464-0
Inserted book: Book O23Mlohe6m with ISBN: 324-1-184-78156-9
Inserted book: Book krlZirtzQy with ISBN: 140-2-096-10505-8
Inserted book: Book vLQGvADFGW with ISBN: 641-9-438-59916-2
Inserted book: Book XWPXwEPTJY with ISBN: 547-4-136-61650-1
Inserted book: Book GDBPkJYGJF with ISBN: 341-9-063-17266-7
Inserted book: Book r8dz2XRQf1 with ISBN: 458-0-954-82623-6
Inserted book: Book ztoqrpcAkK with ISBN: 125-8-041-76014-8
Inserted book: Book SboCehcYRD with ISBN: 318-0-687-28201-4
Inserted book: Book 9NyJXIl3uz with ISBN: 917-7-831-43113-3
Inserted book: Book f1XlsGFlwO with ISBN: 491-6-571-30351-9
Inserted book: Book URFJkAR9jK with ISBN: 452-8-550-37466-2
Inserted book: Book 3W9Ys8bCZE with ISBN: 917-7-889-71811-4
Inserted book: Book PHHIC2N4uI with ISBN: 026-7-419-80858-8
Inserted book: Book JjtKDxhNrT with ISBN: 501-4-874-78839-1
Inserted book: Book vcVgAqikRy with ISBN: 106-8-404-83391-3
Inserted book: Book qJBsxZVczB with ISBN: 214-2-349-84026-9
Inserted book: Book 1NiLzOt4D7 with ISBN: 691-6-902-07606-6
Inserted book: Book cMgZ5cpiJo with ISBN: 132-7-939-05098-2
Inserted book: Book 7d9kOHpHQE with ISBN: 345-1-947-35421-8
Inserted book: Book CrjUG16ci4 with ISBN: 420-3-603-12545-6
Inserted book: Book 0yGxpx0zeY with ISBN: 822-9-178-93092-4
Inserted book: Book cXmLGt4Kr9 with ISBN: 961-0-610-85391-6
Inserted book: Book szEqMloV08 with ISBN: 433-3-644-97837-6
Inserted book: Book Z5Xo5DGlPY with ISBN: 292-2-238-12525-8
Inserted book: Book bOsF9SwSAa with ISBN: 071-5-778-97653-9
Inserted book: Book UGrgWfOLYO with ISBN: 138-2-595-04580-9
Inserted book: Book QFCTn7ickt with ISBN: 964-0-023-76501-7
Inserted book: Book bpWxKp9G8l with ISBN: 428-1-642-97843-9
Inserted book: Book GD7JI7XRKu with ISBN: 055-6-193-89207-9
Inserted book: Book OzEG7lDiRh with ISBN: 573-1-190-08762-8
Inserted book: Book P6CVdn1bO9 with ISBN: 356-7-748-91927-2
Inserted book: Book koSZ3BHJFl with ISBN: 545-8-605-26463-4
Inserted book: Book u7Mi4RnOPk with ISBN: 763-9-114-43641-7
Inserted book: Book edOC1FuoOd with ISBN: 120-5-057-48221-9
Inserted book: Book mrDBqIt2Ln with ISBN: 365-2-736-39694-3
Inserted book: Book Ox4Oo5Z1Pj with ISBN: 424-0-428-52840-9
Inserted book: Book D549EKAucA with ISBN: 134-0-454-64319-5
Inserted book: Book YbiRHBDQHF with ISBN: 210-7-752-61636-3
Inserted book: Book MrJZ7LC2vy with ISBN: 408-3-587-18396-9
Inserted book: Book L4FbZXdqyk with ISBN: 331-8-525-33008-7
Inserted book: Book P1tkxIXYAf with ISBN: 579-7-062-16960-6
Inserted book: Book Smhn7BY4B6 with ISBN: 460-5-009-36173-8
Inserted book: Book hgz9WcS1Uf with ISBN: 715-0-819-72989-6
Inserted book: Book cTZvYOiajP with ISBN: 615-2-487-23134-0
Inserted book: Book soAmyhBWMz with ISBN: 093-4-338-08060-9
Inserted book: Book VgeZ0VZ1tW with ISBN: 346-6-841-55241-5
Inserted book: Book SkqALO0QLX with ISBN: 254-7-064-02867-6
Inserted book: Book Ubo99ulABQ with ISBN: 862-0-390-68720-5
Inserted book: Book qwnkinwkz3 with ISBN: 801-0-695-28814-3
Inserted book: Book vpCIXLm8RV with ISBN: 523-9-074-13122-6
Inserted book: Book WIBFvXUmpP with ISBN: 560-7-719-68845-5
Inserted book: Book B8VVfbRwzP with ISBN: 277-8-287-79626-4
Inserted book: Book sVZAsqkyUZ with ISBN: 904-6-868-08042-5
Inserted book: Book 8CaeSH2RkE with ISBN: 562-7-708-78046-5
Inserted book: Book 5ioaflMEnE with ISBN: 180-6-099-79486-9
Successfully inserted 100 records!

Process finished with exit code 0

```
