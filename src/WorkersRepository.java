class WorkersRepository {
    private Worker[] workersRepository = {
            new Worker("Петров Вадим Семенович", "Cлесарь", "petovvs@mail.ru",
                    89289000000L, 50000, 48),
            new Worker("Борисова Галина Аркадьевна", "Секретарь", "borisovaga@yandex.ru",
                    88124567899L, 39000, 34),
            new Worker("Ставригин Петр Николаевич", "Директор", "stavriginpn@mail.ru",
                    89650000000L, 200000, 43),
            new Worker("Канцлер Вильгельм Йозефович", "Переводчик", "kanzlervj@yandex.ru",
                    88544567349L, 35600, 38),
            new Worker("Никоненко Антон Леонидович", "Разносчик пиццы", "nikonenkoan@yandex.ru",
                    89184567899L, 29000, 19)
    };

    
    Worker[] getWorkersRepository() {
        return workersRepository;
    }

}

