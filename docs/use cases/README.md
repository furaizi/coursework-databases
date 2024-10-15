# Модель прецедентів

В цьому файлі необхідно перелічити всі документи, розроблені в проекті та дати посилання на них.

*Модель прецедентів повинна містити загальні оглядові діаграми та специфікації прецедентів.*



Вбудовування зображень діаграм здійснюється з використанням сервісу [plantuml.com](https://plantuml.com/). 

В markdown-файлі використовується опис діаграми

```md

<center style="
    border-radius:4px;
    border: 1px solid #cfd7e6;
    box-shadow: 0 1px 3px 0 rgba(89,105,129,.05), 0 1px 1px 0 rgba(0,0,0,.025);
    padding: 1em;"
>

@startuml

    right header
        <font size=24 color=black>Package: <b>UCD_3.0
    end header

    title
        <font size=18 color=black>UC_8. Редагувати конфігурацію порталу
        <font size=16 color=black>Діаграма прецедентів
    end title


    actor "Користувач" as User #eeeeaa
    
    package UCD_1{
        usecase "<b>UC_1</b>\nПереглянути список \nзвітів" as UC_1 #aaeeaa
    }
    
    usecase "<b>UC_1.1</b>\nЗастосувати фільтр" as UC_1.1
    usecase "<b>UC_1.2</b>\nПереглянути метадані \nзвіту" as UC_1.2  
    usecase "<b>UC_1.2.1</b>\nДати оцінку звіту" as UC_1.2.1  
    usecase "<b>UC_1.2.2</b>\nПереглянути інформацію \nпро авторів звіту" as UC_1.2.2
    
    package UCD_1 {
        usecase "<b>UC_4</b>\nВикликати звіт" as UC_4 #aaeeaa
    }
    
    usecase "<b>UC_1.1.1</b>\n Використати \nпошукові теги" as UC_1.1.1  
    usecase "<b>UC_1.1.2</b>\n Використати \nрядок пошуку" as UC_1.1.2
    usecase "<b>UC_1.1.3</b>\n Використати \nавторів" as UC_1.1.3  
    
    
    
    User -> UC_1
    UC_1.1 .u.> UC_1 :extends
    UC_1.2 .u.> UC_1 :extends
    UC_4 .d.> UC_1.2 :extends
    UC_1.2 .> UC_1.2 :extends
    UC_1.2.1 .u.> UC_1.2 :extends
    UC_1.2.2 .u.> UC_1.2 :extends
    UC_1 ..> UC_1.2.2 :extends
    
    
    UC_1.1.1 -u-|> UC_1.1
    UC_1.1.2 -u-|> UC_1.1
    UC_1.1.3 -u-|> UC_1.1
    
    right footer
        Аналітичний портал. Модель прецедентів.
        НТУУ КПІ ім.І.Сікорського
        Киів-2020
    end footer

@enduml

**Діаграма прецедентів**

</center>
```

яка буде відображена наступним чином

<center style="
    border-radius:4px;
    border: 1px solid #cfd7e6;
    box-shadow: 0 1px 3px 0 rgba(89,105,129,.05), 0 1px 1px 0 rgba(0,0,0,.025);
    padding: 1em;"
>

@startuml

    right header
        <font size=24 color=black>Package: <b>UCD_3.0
    end header

    title
        <font size=18 color=black>UC_8. Редагувати конфігурацію порталу
        <font size=16 color=black>Діаграма прецедентів
    end title


    actor "Користувач" as User #eeeeaa
    
    package UCD_1{
        usecase "<b>UC_1</b>\nПереглянути список \nзвітів" as UC_1 #aaeeaa
    }
    
    usecase "<b>UC_1.1</b>\nЗастосувати фільтр" as UC_1.1
    usecase "<b>UC_1.2</b>\nПереглянути метадані \nзвіту" as UC_1.2  
    usecase "<b>UC_1.2.1</b>\nДати оцінку звіту" as UC_1.2.1  
    usecase "<b>UC_1.2.2</b>\nПереглянути інформацію \nпро авторів звіту" as UC_1.2.2
    
    package UCD_1 {
        usecase "<b>UC_4</b>\nВикликати звіт" as UC_4 #aaeeaa
    }
    
    usecase "<b>UC_1.1.1</b>\n Використати \nпошукові теги" as UC_1.1.1  
    usecase "<b>UC_1.1.2</b>\n Використати \nрядок пошуку" as UC_1.1.2
    usecase "<b>UC_1.1.3</b>\n Використати \nавторів" as UC_1.1.3  
    
    
    
    User -> UC_1
    UC_1.1 .u.> UC_1 :extends
    UC_1.2 .u.> UC_1 :extends
    UC_4 .d.> UC_1.2 :extends
    UC_1.2 .> UC_1.2 :extends
    UC_1.2.1 .u.> UC_1.2 :extends
    UC_1.2.2 .u.> UC_1.2 :extends
    UC_1 ..> UC_1.2.2 :extends
    
    
    UC_1.1.1 -u-|> UC_1.1
    UC_1.1.2 -u-|> UC_1.1
    UC_1.1.3 -u-|> UC_1.1
    
    right footer
        Аналітичний портал. Модель прецедентів.
        НТУУ КПІ ім.І.Сікорського
        Киів-2020
    end footer

@enduml

</center>

# Модель прецедентів

**Сценарій використання**

<table>
    <tr>
        <th>ID</th>
        <th id="CreateProject"><code>CreateProject</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Створити проект</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Користувач авторизований</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система створює новий проект</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не ввів назву проекту (NullProjectNameException)</li>
                <li>Користувач ввів неправильний формат назви (InvalidProjectNameException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач натискає "Створити проект".</li>
                <li>Користувач заповнює необхідні поля для створення проекту.</li>
                <li>Користувач натискає кнопку "Створити".</li>
                <li>Система перевіряє дані.</li>
                <li>Система створює новий проект.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Натискає "Створити проект";

: Заповнює поля проекту;

: Натискає "Створити";

|Система|
: Перевіряє дані проекту;

note right #ffaaaa
<b> Можливі виключення:
<b> NullProjectNameException
<b> InvalidProjectNameException
end note

: Створює новий проект;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="EditProject"><code>EditProject</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Редагувати проект</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Користувач є учасником проекту</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Проект успішно змінений</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не має прав на редагування проекту (InsufficientPermissionsException)</li>
                <li>Невірний формат даних (InvalidDataFormatException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач відкриває проект для редагування.</li>
                <li>Користувач змінює потрібні поля.</li>
                <li>Користувач натискає "Зберегти".</li>
                <li>Система перевіряє права доступу.</li>
                <li>Система зберігає зміни.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Відкриває проект для редагування;

: Змінює поля проекту;

: Натискає "Зберегти";

|Система|
: Перевіряє права доступу;

note right #ffaaaa
<b> Можливі виключення:
<b> InsufficientPermissionsException
<b> InvalidDataFormatException
end note

: Зберігає зміни проекту;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="DeleteProject"><code>DeleteProject</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Видалити проект</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Користувач має права на видалення проекту</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система видаляє проект</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не має прав на видалення проекту (InsufficientPermissionsException)</li>
                <li>Проект не знайдено (ProjectNotFoundException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач відкриває проект для видалення.</li>
                <li>Користувач натискає "Видалити".</li>
                <li>Система перевіряє права користувача.</li>
                <li>Система видаляє проект.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Відкриває проект для видалення;

: Натискає "Видалити";

|Система|
: Перевіряє права користувача;

note right #ffaaaa
<b> Можливі виключення:
<b> InsufficientPermissionsException
<b> ProjectNotFoundException
end note

: Видаляє проект;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="AddMemberToProject"><code>AddMemberToProject</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Додати учасника до проекту</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Користувач має права на редагування проекту</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Учасник доданий до проекту</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не має прав на додавання учасників (InsufficientPermissionsException)</li>
                <li>Користувач не знайдений (UserNotFoundException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач відкриває список учасників проекту.</li>
                <li>Користувач вводить ім'я або пошту учасника.</li>
                <li>Користувач натискає "Додати".</li>
                <li>Система перевіряє права користувача.</li>
                <li>Система додає учасника до проекту.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Відкриває список учасників проекту;

: Вводить дані учасника;

: Натискає "Додати";

|Система|
: Перевіряє права;

note right #ffaaaa
<b> Можливі виключення:
<b> InsufficientPermissionsException
<b> UserNotFoundException
end note

: Додає учасника до проекту;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="RemoveMemberFromProject"><code>RemoveMemberFromProject</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Видалити учасника з проекту</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Користувач має права на редагування проекту</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Учасник видалений з проекту</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не має прав на видалення учасників (InsufficientPermissionsException)</li>
                <li>Користувач не знайдений (UserNotFoundException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач відкриває список учасників проекту.</li>
                <li>Користувач вибирає учасника для видалення.</li>
                <li>Користувач натискає "Видалити".</li>
                <li>Система перевіряє права користувача.</li>
                <li>Система видаляє учасника з проекту.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Відкриває список учасників проекту;

: Вибирає учасника;

: Натискає "Видалити";

|Система|
: Перевіряє права користувача;

note right #ffaaaa
<b> Можливі виключення:
<b> InsufficientPermissionsException
<b> UserNotFoundException
end note

: Видаляє учасника з проекту;

stop;
@enduml

