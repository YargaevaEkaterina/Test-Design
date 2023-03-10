import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("YargaevaEkaterina")
@Feature("Маршруты")
@Story("Создание маршрутного листа")
@Severity(NORMAL)
public class CreationRouteTest {
    @BeforeEach
    public void openRouteCreation()  {
        step("Предусловие: Открыть модальное окно создания маршрута",() -> {
            step("Открыть WMS",() -> {

            });

            step("Авторизоваться в wms",()-> {

            });

            step("Открыть страницу: https://suslik.dev.cluster.kznexpess.com/assembly/routes",()-> {

            });

            step("Нажать кнопку 'Добавить маршрут'",()-> {

            });
        });
    }

    @Test
    @DisplayName("Внешний вид модального окна создания маршрута")
    public void screenshotTestRouteCreation() {
        step("Открывшееся модальное окно совпадает с ожидаемым скриншотом: https://drive.google.com/file/d/18xw5AdNDbBb_V8qx7I-M8pJWbcXWnsv4/view?usp=share_link",()-> {

        });
    }

    @Test
    @DisplayName("Поиск в модальном окне создания маршрута")
    public void searchRouteCreationTest() {
        step("Нажать на поле поиска",()-> {

        });

        step("Ввести название города",()-> {
            step("Введенный город отображается в результатах поиска",()-> {

            });
        });

        step("Ввести название ПВЗ",()-> {
            step("Город введенного ПВЗ отображается в результатах поиска",()-> {

            });
        });
    }

    @Test
    @DisplayName("Выбор города в модальном окне создания маршрута")
    public void selectCityRouteCreation() {
        step("Нажать на название города", () ->{
            step("Строка выбранного города отмечается серым цветом и жирным шрифтом", () ->{

            });

            step("Открывается список ПВЗ выбранного города", () ->{

            });
        });
    }

    @Test
    @DisplayName("Тултип модального окна создания маршрута")
    public void tooltipRouteCreationTest() {
        step("Нажать на значок подсказки напротив выбранного ПВЗ",()-> {
            step("Отображается текстовая подсказка",()-> {

            });
        });
    }

    @Test
    @DisplayName("Чекбокс невыбранного города")
    public void unselectedCityCheckbox() {
            step("Чекбокс невыбранного города - белый и активный", () ->{

            });
    }

    @Test
    @DisplayName("Неактивный чекбокс города и ПВЗ")
    public void inactiveCityCheckbox() {
        step("При нажатии на неактивный чекбокс города ничего не происходит",()-> {

        });

        step("При нажатии на неактивный чекбокс ПВЗ ничего не происходит",()-> {

        });
    }

    @Test
    @DisplayName("Частичный выбор ПВЗ города")
    public void partiallySelectedCityCheckbox() {
        step("Нажать на название города с несколькими ПВЗ", () ->{

        });

        step("Нажать на чекбокс одного из ПВЗ", () ->{
            step("Чекбокс города, ПВЗ которого выбраны частично - красный с белой горизонтальной полоской", () ->{

            });
        });

        step("Нажать на чекбокс города",()-> {
            step("При нажатии на чекбокс с белой полоской происходит довыбор всех не выбранных ПВЗ со всеми типами доставки",()-> {

            });
        });

    }

    @Test
    @DisplayName("Выбор всех ПВЗ города")
    public void selectAllDeliveryPoint() {
        step("Нажать на чекбокс города", () ->{
            step("При нажатии на полностью белый чекбокс города происходит выбор всех ПВЗ города со всеми типами доставки",()-> {

            });
        });

        step("Нажать на отмеченный чекбокс города", () ->{
            step("При нажатии на чекбокс города с белой галочкой происходит отмена выбора всех ПВЗ со всеми типами доставки",()-> {

            });
        });

        step("Нажать на название города", () ->{

        });

        step("Отметить все чекбоксы ПВЗ этого города", () ->{
            step("Чек-бокс города, все ПВЗ которого выбраны - красный с белой галочкой",()-> {

            });
        });
    }

    @Test
    @DisplayName("Сохранение созданного маршрута")
    public void saveRouteTest() {
        step("Нажать на чекбокс города",()-> {
            step("Чекбокс города выделен красной галочкой, чекбокс ПВЗ выделен красным",()-> {

            });
        });

        step("Нажать кнопку 'Сохранить'",()-> {
            step("Появляется сообщение о успешном создании маршрута",()-> {

            });
        });

        step("Нажать кнопку 'Добавить маршрут'",()-> {
            step("Открывается модальное окно создания маршрута",()-> {

            });
        });

        step("Нажать на название города, для которого был создан маршрут ранее",()-> {
            step("В блоке с ПВЗ в чекбоксе ПВЗ указан номер ранее созданного маршрута",()-> {

            });
        });
    }

    @Test
    @DisplayName("Закрытие модального окна создания маршрута без изменений")
    public void closeEmptyCreationRouteTest() {
        step("Нажать на пространтство вне модального окна",()-> {
            step("Модальное окно закрывается",()-> {

            });
        });
    }

    @Test
    @DisplayName("Отрицательный ответ в окне предупреждения о потере изменений при закрытии окна маршрута")
    public void closeNoCreationRouteTest() {
        step("Внести изменения и нажать на пространство вне модального окна", () -> {
            step("Появляется предупреждение о закрытии окна без сохранения изменений", () -> {

            });
        });

        step("Нажать на 'Нет' в окне предупреждения о закрытии", () -> {
            step("Предупреждение исчезает", () -> {

            });

            step("Модальное окно создания маршрута не закрывается", () -> {

            });
        });
    }

    @Test
    @DisplayName("Положительный ответ в окне предупреждения о потере изменений при закрытии окна маршрута")
    public void closeYesCreationRouteTest() {
        step("Внести изменения и нажать на пространство вне модального окна", () -> {
            step("Появляется предупреждение о закрытии окна без сохранения изменений", () -> {

            });
        });

        step("Нажать на 'Да' в окне предупреждения о закрытии",()-> {
            step("Предупреждение исчезает",()-> {

            });

            step("Модальное окно создания маршрута закрывается",()-> {

            });

            step("Маршрут не сохраняется",()-> {

            });
        });

        step("Нажать на кнопку 'Добавить маршрут'",()-> {
            step("Не отмечен ни один чекбокс в модальном окне создания маршрута",()-> {

            });
        });
    }
}
