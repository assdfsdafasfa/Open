class OriginalClass { 
    String formatted = switch (o) {
    case Integer i -> String.format("int %d", i);
    case Long l    -> String.format("long %d", l);
    // extract variable : o.toString()
    default        -> {
        String newVariable = o.toString();
        yield newVariable;
    }
};
}