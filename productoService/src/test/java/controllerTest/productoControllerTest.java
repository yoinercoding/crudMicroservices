package controllerTest;

import com.back.crud.entities.Producto;
import com.back.crud.repository.ProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class productoControllerTest {
    @Mock
    private ProductoRepository repository;

    @InjectMocks
    private productoControllerTest controllerTest;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void delete_ProductoExistente_DebeEliminarYDevolverProducto() {
        // Arrange
        int id = 1;
        Producto producto = new Producto();
        when(repository.findById(id)).thenReturn(producto);
    }

    @Test
    public void delete_ProductoNoExistente_DebeDevolverNull() {
        // Arrange
        int id = 1;
        when(repository.findById(id)).thenReturn(null);

        // Act
        Producto resultado = controllerTest.repository.findById(2);

        // Assert
        verify(repository, never()).delete(any(Producto.class));
        assertNull(resultado);
    }
}
