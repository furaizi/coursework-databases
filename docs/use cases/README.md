# Модель прецедентів

**Сценарій використання**

<table>
    <tr>
        <th>ID</th>
        <th id="CreateUser"><code>CreateUser</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Створити користувача</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Система не зареєструвала користувача</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система створює обліковий запис користувача</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач не ввів ім'я користувача (NullUsernameException)</li>
                <li>Користувач не ввів пошту (NullEmailException)</li>
                <li>Користувач не ввів пароль (NullPasswordException)</li>
                <li>Користувач з таким ім'ям вже існує (UserAlreadyExistsException)</li>
                <li>Користувач вказав неправильний формат пошти (WrongEmailFormatException)</li>
                <li>Користувач ввів недостатньо сильний пароль (менше 8 символів, не містить букв і цифр) (WeakPasswordException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач натискає на кнопку "Зареєструватись"</li>
                <li>Користувач заповнює поля реєстрації (ім'я користувача, пошта, пароль)</li>
                <li>Користувач натискає на кнопку "Створити"</li>
                <li>Система перевіряє введені поля на валідність</li>
                <li>Система створює обліковий запис користувача</li>
                <li>Користувач автоматично входить в систему</li>
            </ol>
        </td>
    </tr>
</table>

|Користувач|
start;
: Натискає на кнопку "Зареєструватись";

: Заповнює поля реєстрації
(ім'я користувача, пошта, пароль);

: Натискає на кнопку "Створити";

|Система|
: Перевіряє введені поля на валідність;

note right #ffaaaa
<b> Можливі виключення:
<b> NullUsernameException
<b> NullEmailException
<b> NullPasswordException
<b> UserAlreadyExistsException
<b> WrongEmailFormatException
<b> WeakPasswordException
end note

: Створює обліковий запис користувача;

|Користувач|
: Автоматично входить в систему;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="AuthorizeUser"><code>AuthorizeUser</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Авторизувати користувача</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Система зареєструвала користувача</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система авторизувала користувача</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Користувач ввів неправильний пароль (InvalidPasswordException)</li>
                <li>Користувач ввів неправильне ім'я користувача (InvalidUsernameException)</li>
                <li>Система заблокувала користувача (UserBannedException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Користувач вводить ім'я користувача і пароль.</li>
                <li>Система перевіряє введені дані (можливе InvalidPasswordException або InvalidUsernameException)</li>
                <li>Система перевіряє статус користувача (можливе UserBannedException)</li>
                <li>Користувач успішно входить у систему</li>
            </ol>
        </td>
    </tr>
</table>

|Користувач|
start;
: Вводить ім'я користувача і пароль;

|Система|
: Перевіряє введені дані;

note right #ffaaaa
<b> Можливі виключення:
<b> InvalidPasswordException
<b> InvalidUsernameException
end note

: Перевіряє статус користувача;

note right #ffaaaa
<b> Можливе виключення:
<b> UserBannedException
end note

|Користувач|
: Успішно входить у систему;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="EditUser"><code>EditUser</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Редагувати користувача</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Користувач, адміністратор, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Система авторизувала користувача або адміністратора</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система змінила дані користувача</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Система не знайшла користувача (UserNotFoundException)</li>
                <li>Користувач має недостатньо прав для редагування (InsufficientPermissionsException)</li>
                <li>Користувач ввів дані у неправильному форматі (InvalidDataFormatException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Адміністратор або користувач відкриває профіль користувача.</li>
                <li>Користувач або адміністратор змінює потрібні поля.</li>
                <li>Система перевіряє права (можливе InsufficientPermissionsException).</li>
                <li>Система перевіряє введені дані на правильність (можливе InvalidDataFormatException).</li>
                <li>Система зберігає оновлені дані користувача.</li>
            </ol>
        </td>
    </tr>
</table>

@startuml

|Користувач|
start;
: Відкриває профіль користувача;

|Адміністратор|
: Змінює потрібні поля;

|Система|
: Перевіряє права;

note right #ffaaaa
<b> Можливе виключення:
<b> InsufficientPermissionsException
end note

: Перевіряє введені дані;

note right #ffaaaa
<b> Можливі виключення:
<b> InvalidDataFormatException
<b> UserNotFoundException
end note

: Зберігає оновлені дані користувача;

stop;
@enduml

<table>
    <tr>
        <th>ID</th>
        <th id="DeleteUser"><code>DeleteUser</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Видалити користувача</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Адміністратор, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Система авторизувала адміністратора</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система видаляє користувача</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Система не знайшла користувача (UserNotFoundException)</li>
                <li>Користувач має недостатньо прав для видалення (InsufficientPermissionsException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Адміністратор вибирає користувача для видалення.</li>
                <li>Адміністратор натискає кнопку "Видалити користувача".</li>
                <li>Система перевіряє права адміністратора (можливе InsufficientPermissionsException).</li>
                <li>Система видаляє користувача (можливе UserNotFoundException).</li>
            </ol>
        </td>
    </tr>
</table>

<table>
    <tr>
        <th>ID</th>
        <th id="DeleteUser"><code>DeleteUser</code></th>
    </tr>
    <tr>
        <th>Назва</th>
        <td>Видалити користувача</td>
    </tr>
    <tr>
        <th>Учасники</th>
        <td>Адміністратор, система</td>
    </tr>
    <tr>
        <th>Передумови</th>
        <td>Система авторизувала адміністратора</td>
    </tr>
    <tr>
        <th>Результат</th>
        <td>Система видаляє користувача</td>
    </tr>
    <tr>
        <th>Виключні ситуації</th>
        <td>
            <ul>
                <li>Система не знайшла користувача (UserNotFoundException)</li>
                <li>Користувач має недостатньо прав для видалення (InsufficientPermissionsException)</li>
            </ul>
        </td>
    </tr>
    <tr>
        <th>Основний сценарій</th>
        <td>
            <ol>
                <li>Адміністратор вибирає користувача для видалення.</li>
                <li>Адміністратор натискає кнопку "Видалити користувача".</li>
                <li>Система перевіряє права адміністратора (можливе InsufficientPermissionsException).</li>
                <li>Система видаляє користувача (можливе UserNotFoundException).</li>
            </ol>
        </td>
    </tr>
</table>
@startuml

|Адміністратор|
start;
: Вибирає користувача для видалення;

: Натискає на кнопку "Видалити користувача";

|Система|
: Перевіряє права адміністратора;

note right #ffaaaa
<b> Можливе виключення:
<b> InsufficientPermissionsException
end note

: Видаляє користувача;

note right #ffaaaa
<b> Можливе виключення:
<b> UserNotFoundException
end note

stop;
@enduml
