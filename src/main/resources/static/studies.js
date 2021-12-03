document.addEventListener("DOMContentLoaded", () => {
    let _button = document.querySelector("#mBut");
    let exampleModal = document.getElementById('datamodal')
    exampleModal.addEventListener('show.bs.modal', function (event) {
        // Button that triggered the modal
        let button = event.relatedTarget
        // Extract info from data-bs-* attributes
        let recipient = button.getAttribute('data-bs-whatever')

        let modalTitle = exampleModal.querySelector('.modal-title')
        let modalBody = exampleModal.querySelector(".modal-body div")
        modalTitle.textContent = 'Программа раздела ' + recipient
        switch (recipient) {
            case "1":
                modalBody.innerHTML = `
                <ul>
                    <li class="card-text">Классификация БЛА</li>
                    <li class="card-text">Цели и задачи БЛА</li>
                    <li class="card-text">Принципы управления и взаимодействия БЛА</li>
                    <li class="card-text">Перспективы развития</li>
                    <li class="card-text">Знакомство с комплексом, составные части</li>
                    <li class="card-text">Обзор по модельному ряду</li>
                    <li class="card-text">Комплектация и составные части комплекса на примере одной модели</li>
                    <li class="card-text">Функции составных частей комплекса</li>
                </ul>
                `;
                _button.addEventListener("click", (e) => {
                    e.preventDefault();
                    window.location = "/1st"
                })
                break;
            case "2":
                modalBody.innerHTML = `
                <ul>
                    <li class="card-text">Аэродинамические схемы самолетов</li>
                    <li class="card-text">Виды профилей</li>
                    <li class="card-text">Угол атаки крыла</li>
                    <li class="card-text">Центровка планера</li>
                    <li class="card-text">Удельная нагрузка</li>
                </ul>
                `;
                _button.addEventListener("click", (e) => {
                    e.preventDefault();
                    window.location = "/2nd"
                })
                break;
            case "3":
                modalBody.innerHTML = `
                <ul>
                    <li class="card-text">Основные детали и узлы БПЛА</li>
                    <li class="card-text"> Конструкция корпуса планера</li>
                    <li class="card-text"> Силовая установка</li>
                    <li class="card-text"> Компоновка внутренних элементов</li>
                    <li class="card-text"> Диагностика неисправностей конструкции планера</li>
                    <li class="card-text"> Комплектация ЗИПа</li>
                    <li class="card-text"> Назначение его элементов</li>
                    <li class="card-text"> Методы мелкого ремонта планера</li>
                </ul>
                `;
                _button.addEventListener("click", (e) => {
                    e.preventDefault();
                    window.location = "/3rd"
                })
                break;
        }
    })
})