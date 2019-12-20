export class BooksDetails {
    constructor(private bookid: number,
                private bookName: string,
                private author1: string,
                private author2: string,
                private publisher: string,
                private yearOfPublication: number,
                booksDetails: BooksDetails) {}
}
