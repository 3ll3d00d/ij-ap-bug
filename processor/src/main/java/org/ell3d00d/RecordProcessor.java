package org.ell3d00d;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

import static javax.lang.model.SourceVersion.RELEASE_17;

@SupportedAnnotationTypes("org.ell3d00d.*")
@SupportedSourceVersion(RELEASE_17)
@AutoService(Processor.class)
public class RecordProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Record.class)) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, "Processing " + element);
        }
        return true;
    }
}